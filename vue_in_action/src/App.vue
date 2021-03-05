<template>
  <div id="app">
    <header>
      <div class="navbar navbar-default">
        <h1 v-text="sitename"></h1>
        <div class="nav navbar-nav navbar-right cart">
          <button
            type="button"
            class="btn btn-default btn-lg"
            v-on:click="showCheckout"
          >
            <span class="glyphicon glyphicon-shopping-cart">
              {{ cartItemCount }}
            </span>
            <span>체크아웃</span>
          </button>
        </div>
      </div>
    </header>
    <main>
      <div class="row product">
        <div v-if="showProduct">
          <div class="row product">
            <div v-for="product in sortedProducts" v-bind:key="product.id">
              <div class="row">
                <div class="col-md-5 col-md-offset-0">
                  <figure>
                    <img class="product" v-bind:src="product.image" />
                  </figure>
                </div>
                <div class="col-md-6 col-md-offset-0 description">
                  <h1 v-text="product.title"></h1>
                  <p v-html="product.description"></p>
                  <p class="price">
                    {{ product.price | formatPrice }}
                  </p>
                  <button
                    class="btn btn-primary btn-lg"
                    v-on:click="addToCart(product)"
                    v-if="canAddToCart(product)"
                  >
                    장바구니 담기
                  </button>
                  <button disabled="true" class="btn btn-primary btn-lg" v-else>
                    장바구니 담기
                  </button>
                  <span
                    class="inventory-message"
                    v-if="
                      product.availableInventory - cartCount(product.id) == 0
                    "
                  >
                    품절!
                  </span>
                  <span
                    class="inventory-message"
                    v-else-if="
                      product.availableInventory - cartCount(product.id) < 5
                    "
                  >
                    {{ product.availableInventory - cartCount(product.id) }}
                    남았습니다.
                  </span>
                  <span class="inventory-message" v-else>
                    지금 구매하세요!
                  </span>
                  <span
                    v-bind:class="{
                      'rating-active': checkRating(n, product),
                    }"
                    v-for="n in 5"
                    v-bind:key="n"
                  >
                  </span>
                </div>
              </div>
              <!-- end of line -->
              <hr />
            </div>
            <!-- end of v-for -->
          </div>
          <!-- end of showproduct -->
        </div>
        <div v-else>
          <div class="row"></div>
        </div>
      </div>
    </main>
    <div>
      <div class="form-group textalign-set">
        <div class="col-md-12">
          <strong>주소: </strong>
        </div>
        <div class="col-md-12">
          <strong>
            <input v-model.trim="order.address" class="form-control" />
          </strong>
        </div>
      </div>
      <div class="form-group textalign-set">
        <div class="col-md-12">
          <strong>도시: </strong>
        </div>
        <div class="col-md-12">
          <strong>
            <input v-model.trim="order.city" class="form-control" />
          </strong>
        </div>
      </div>
      <div class="form-group textalign-set">
        <div class="col-md-2">
          <strong>주: </strong>
        </div>
        <div class="col-md-6 col-md-offset-4">
          <strong>우편번호:</strong>
        </div>
        <div class="col-md-2">
          <select v-model="order.state" class="form-control">
            <option disabled value="">주</option>
            <option
              v-for="(state, key) in states"
              v-bind:value="state"
              v-bind:key="key"
            >
              {{ key }}
            </option>
          </select>
        </div>
        <div class="col-md-6 col-md-offset-4">
          <input
            v-model.number="order.zip"
            class="form-control"
            type="number"
          />
        </div>
      </div>
      <div class="form-group textalign-set">
        <div class="col-md-6">
          <strong>이름:</strong>
        </div>
        <div class="col-md-6">
          <strong>성:</strong>
        </div>
        <div class="col-md-6">
          <input v-model.trim="order.firstName" class="form-control" />
        </div>
        <div class="col-md-6">
          <input v-model.trim="order.lastName" class="form-control" />
        </div>
      </div>
      <div class="form-group textalign-set">
        <div class="col-md-6 boxes">
          <input
            type="checkbox"
            id="gift"
            value="true"
            v-model="order.gift"
            v-bind:true-value="order.sendGift"
            v-bind:false-value="order.dontSendGift"
          />
          <label for="gift">선물로 보내기?</label>
        </div>
      </div>
      <div class="form-group textalign-set">
        <div class="col-md-6 boxes">
          <input
            type="radio"
            id="home"
            v-bind:value="order.home"
            v-model="order.method"
          />
          <label for="home">자택</label>
          <input
            type="radio"
            id="business"
            v-bind:value="order.business"
            v-model="order.method"
          />
          <label for="business">직장</label>
        </div>
      </div>
      <div class="form-group textalign-set">
        <div class="col-md-6">
          <button
            type="submit"
            class="btn btn-primary submit"
            v-on:click="submitForm"
          >
            주문하기
          </button>
        </div>
      </div>
      <div class="col-md-12 verify textalign-set">
        <pre>
      이름 : {{ order.firstName }}
      성 : {{ order.lastName }}
      주소 : {{ order.address }}
      도시 : {{ order.city }}
      우편번호 : {{ order.zip }} {{ typeof order.zip }}
      주 : {{ order.state }}
      주소지 : {{ order.method }}
      선물 : {{ order.gift }}
      </pre
        >
      </div>
    </div>
  </div>
</template>

<script>
var APP_LOG_LIFECYCLE_EVENTS = true;
export default {
  beforeCreate: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("beforeCreate");
    }
  },
  created: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("created");
    }
    this.$http.get("/assets/products.json").then((response) => {
      this.products = response.data.products;
      console.log(this.products);
    });
  },
  beforeMount: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("beforeMount");
    }
  },
  mounted: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("mounted");
    }
  },
  beforeUpdate: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("beforeUpdate");
    }
  },
  updated: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("updated");
    }
  },
  beforeDestroyed: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("beforeDestroyed ");
    }
  },
  destroyed: function() {
    if (APP_LOG_LIFECYCLE_EVENTS) {
      console.log("destroyed");
    }
  },
  data: function() {
    return {
      sitename: "애완용품샵",
      products: [],
      cart: [],
      showProduct: true,
      order: {
        firstName: "",
        lastName: "",
        address: "",
        city: "",
        zip: "",
        state: "",
        method: "자택",
        business: "직장 주소",
        home: "자택 주소",
        gift: "선물로 보내기",
        sendGift: "선물로 보내기",
        dontSendGift: "선물로 보내지 않기",
      },
      states: {
        AL: "알라바마",
        AR: "애리조나",
        CA: "캘리포니아",
        NV: "네바다",
      },
    };
  },
  computed: {
    cartItemCount() {
      return this.cart.length || "";
    },
    sortedProducts() {
      if (this.products.length > 0) {
        let productArray = this.products.slice(0);
        var compareTest = function compare(a, b) {
          if (a.title.toLowerCase() < b.title.toLowerCase()) {
            return -1;
          }
          if (a.title.toLowerCase() > b.title.toLowerCase()) {
            return 1;
          }
          return 0;
        };
        return productArray.sort(compareTest);
      }
      return this.products;
    },
  },
  methods: {
    checkRating(n, product) {
      return product.rating - n >= 0;
    },
    showCheckout: function() {
      this.showProduct = this.showProduct ? false : true;
    },
    addToCart: function(product) {
      this.cart.push(product.id);
    },
    submitForm: function() {
      alert("제출 완료");
    },
    canAddToCart: function(product) {
      return product.availableInventory > this.cartCount(product.id);
    },
    cartCount: function(id) {
      let count = 0;
      for (var i = 0; i < this.cart.length; i++) {
        if (this.cart[i] === id) {
          count++;
        }
      }
      return count;
    },
  },
  filters: {
    formatPrice: function(price) {
      if (!parseInt(price)) {
        return "";
      }
      if (price > 9999) {
        var priceString = (price / 100).toFixed(2);
        var priceArray = priceString.split("").reverse();
        var index = 3;
        while (priceArray.length > index + 3) {
          priceArray.splice(index + 3, 0, ",");
          index += 4;
        }
        return "$" + priceArray.reverse().join("");
      } else {
        return "$" + (price / 100).toFixed(2);
      }
    },
  },
};
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

// #nav {
//   padding: 30px;

//   a {
//     font-weight: bold;
//     color: #2c3e50;

//     &.router-link-exact-active {
//       color: #42b983;
//     }
//   }
// }
</style>


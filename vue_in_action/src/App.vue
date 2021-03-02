<template>
  <div id="app">
    <header>
      <div class="navbar navbar-default">
        <h1 v-text="sitename"></h1>
      </div>
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
    </header>
    <main>
      <div class="row product">
        <div v-if="showProduct"></div>
        <div v-else></div>
        <div class="col">
          <figure>
            <img v-bind:src="product.image" />
          </figure>
        </div>
        <div class="col col-expand">
          <h1 v-text="product.title"></h1>
          <p v-html="product.description"></p>
          <p class="price">
            {{ product.price | formatPrice }}
          </p>
        </div>
      </div>
    </main>
    <button
      class="btn btn-primary btn-lg"
      v-on:click="addToCart"
      v-if="canAddToCart"
    >
      장바구니 담기
    </button>
    <button disabled="true" class="btn btn-primary btn-lg" v-else>
      장바구니 담기
    </button>
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
      product: {
        id: 1001,
        title: "고양이 사료, 25파운드",
        description:
          "당신의 고양이를 이한 <em>거부할 수 없는</em>, " +
          "유기농 25파운드 사료입니다.",
        price: 2000,
        image: "assets/images/product-fullsize.png",
        availableInventory: 5,
      },
      cart: [],
      showProduct: true,
      order: {
        firstName: "",
        lastName: "",
      },
    };
  },
  computed: {
    cartItemCount: function() {
      return this.cart.length || "";
    },
    canAddToCart: function() {
      return this.product.availableInventory > this.cartItemCount;
    },
  },
  methods: {
    showCheckout: function() {
      this.showProduct = this.showProduct ? false : true;
    },
    addToCart: function() {
      this.cart.push(this.product.id);
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

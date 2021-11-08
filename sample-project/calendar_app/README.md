# calendar_app

## Project setup
```
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Lints and fixes files
```
npm run lint
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).

# tailwindcss and v-calendar
1. postcss default install
2. tailwindcss install - https://tailwindcss.com/docs/installation
   1. npm install tailwindcss@latest
   2. config file crate
      1. npx tailwindcss init
   3. postcss.config.js create
   4. using-with-preprocessors - https://tailwindcss.com/docs/using-with-preprocessors
      2. Error: PostCSS plugin tailwindcss requires PostCSS 8.
         1. https://tailwindcss.com/docs/installation#post-css-7-compatibility-build
         2. npm uninstall tailwindcss postcss autoprefixer
         3. npm install tailwindcss@npm:@tailwindcss/postcss7-compat @tailwindcss/postcss7-compat postcss@^7 autoprefixer@^9
      3. npm install postcss-import@12.0.1
      4. npm install postcss-preset-env
      5. // postcss.config.js
        module.exports = {
            plugins: [
                require('postcss-import'),
                require('tailwindcss'),
                require('postcss-preset-env')({ stage: 1 }),
            ]
        }
    5. main.js : import "tailwindcss/tailwind.css";
3. v-calendar install - https://vcalendar.io/installation.html
   1. npm install v-calendar

# Vuetify Use
vue add vuetify

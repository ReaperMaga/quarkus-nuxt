// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  modules: [
    '@nuxtjs/tailwindcss'
  ],
  compatibilityDate: '2024-08-19',
  devtools: {
    enabled: true
  },
  typescript: {
    shim: false
  }
})

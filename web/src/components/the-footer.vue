<template>
  <a-layout-footer :style="{ textAlign: 'center' }">
    Ant Design ©2018 Created by Ant UED
  </a-layout-footer>
</template>

<script>
import { defineComponent } from 'vue';
export default {
  name: "the-footer",
  props: {
    msg: String,
  },
}
</script>

<style scoped>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}
.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}

</style>
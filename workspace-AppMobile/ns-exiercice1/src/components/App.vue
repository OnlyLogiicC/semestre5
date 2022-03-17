<template>
    <Page>
        <ActionBar title="Welcome to NativeScript-Vue!"/>
        <DockLayout stretchLastChild='true'>
            <Button dock="bottom" text="Create Log" @tap="onButtonTap"/>
            <Label class="message" :text="msg"/>
        </DockLayout>
    </Page>
</template>

<script >
  export default {
    data() {
      return {
        msg: 'C\'est frais !'
      }
    },
    methods: {
      onButtonTap() {
        console.log(this.msg);
      }
    }
  }
</script>

<style scoped>
    ActionBar {
        background-color: #53ba82;
        color: #ffffff;
    }

    .message {
        vertical-align: center;
        text-align: center;
        font-size: 20;
        color: #333333;
    }
</style>
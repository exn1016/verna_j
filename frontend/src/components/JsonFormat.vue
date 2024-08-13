<template>
<main id="jsonFmain">
    <div class="srcDivWrapper"><textarea id="jsonSrc" class="inputArea" v-model="inputShow" @input="inputChg"></textarea></div>
    <div id="dragEle"></div>
    <div class="showDivWrapper">
        <p id="jsonRes" class="outputArea">{{ jsonResShow }}</p>
    </div>
</main>
</template>

<script>
export default {
    data() {
        return {
            inputShow: "",
            jsonResShow: ""
        }
    },
    methods: {
        inputChg(event) {
            var tmp = this.inputShow
            this.jsonResShow = ""
        }
    }
}
</script>

<style>
#jsonFmain {
    background-color: lightgray;
    width: 99%;
    height: 95%;
    position: absolute;
    font-family: menlo, monospace, Tahoma, 微软雅黑, 幼圆 !important;
}

.srcDivWrapper {
    background-color: black;
    width: 49%;
    height: 96.5%;
    padding: 0%;
    position: relative;
    cursor: move;
    float: left;
}

.inputArea {
    width: 91.5%;
    height: 96.5%;
    padding: 4%;
    border: 1px solid #eee;
    float: left;
    resize: none;
}

#dragEle {
    background-color: red;
    width: 1px;
    height: 96.5%;
    position: relative;
    cursor: move;
    float: left;
}

.showDivWrapper {
    background-color: lightcyan;
    width: 49%;
    height: 96.5%;
    padding: 0%;
    position: relative;
    cursor: move;
    float: left;
}

.outputArea {
    background-color: lightpink;
    width: 91.5%;
    height: 96.5%;
    padding: 4%;
    border: 1px solid #eee;
    position: relative;
    float: left;
}

.inputPadding {
    line-height: 100%;
    font-family: menlo, monospace, Tahoma, 微软雅黑, 幼圆;
}
</style>

<template>
<div id="tabdiv">
    <p class="tabclick" @click="tabChg('TimeFormat')">TimeFormat</p>
    <p class="tabclick" @click="tabChg('JsonFormat')">JsonFormat</p>
</div>
<component :is="tabComponent"></component>
</template>

<script>
import TimeFormat from './TimeFormat.vue';
import JsonFormat from './JsonFormat.vue'
import Bob from './Bob.vue'

export default {
    data() {
        return {
            tabComponent: TimeFormat
        }
    },
    methods: {
        tabChg(selectedTab) {
            console.log(selectedTab);
            this.tabComponent = selectedTab;
        }
    },
    components: {
        TimeFormat,
        JsonFormat,
        Bob
    }
}
</script>

<style>
#tabdiv {
    background-color: gray;
    width: 100%;
    height: 40px;
    float: unset;
}

.tabclick {
    width: 10%;
    height: 10px;
    font-weight: 4000;
    float: left;
}
</style>

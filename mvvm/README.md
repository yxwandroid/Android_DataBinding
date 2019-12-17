## Android  LiveData 使用

### 定义 

LiveData 是一个可被观察的数据持有类。与普通的被观察者（如 RxJava 中的 Observable）不同的是，LiveData 是生命周期感知的，也就是说，它能感知其它应用组件（Activity，Fragment，Service）的生命周期。这种感知能力可以确保只有处于 active 状态的组件才能收到 LiveData 的更新。详情可查看 Lifecycle 。


### 参考
https://www.journaldev.com/22561/android-mvvm-livedata-data-binding



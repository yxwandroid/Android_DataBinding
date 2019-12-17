## Android DataBinding 使用
### 定义 

数据绑定库是一种支持库，借助该库，您可以使用声明性格式（而非程序化地）将布局中的界面组件绑定到应用中的数据源。
布局通常是使用调用界面框架方法的代码在 Activity 中定义的。例如，下面的代码会调用 findViewById() 以查找 TextView 微件，并将其绑定到 viewModel 变量的 userName 属性：

[android 官方文档](https://developer.android.com/topic/libraries/data-binding)
### 使用步骤 

    android节点下引入 dataBinding{ enabled=true }

![](images/58452c78.png)


### 创建实体 eg: User
        
        
        public class User extends BaseObservable {
        
        
            String name;
            int age;
        
        
            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        
            @Bindable
            public String getName() {
                return name;
            }
        
        
            public void setName(String name) {
                this.name = name;
                 notifyChange();
        //        notifyPropertyChanged(BR.m);
            }
        
            @Bindable
            public int getAge() {
                return age;
            }
        
        
            public void setAge(int age) {
                this.age = age;
                notifyChange();
            }
        
        
            public void update() {
                this.name = "wilson yang";
                this.age = 1232;
                notifyChange();
            }
        
        
        }

 
### 编辑布局


        
        <?xml version="1.0" encoding="utf-8"?>
        <layout xmlns:tools="http://schemas.android.com/tools">
        
            <data>
        
                <import type="com.wilson.android_databinding.model.User" />
        
                <variable
                    name="user"
                    type="com.wilson.android_databinding.model.User" />
        
        
            </data>
        
            <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
                android:layout_width="match_parent"
                android:layout_height="match_parent">
        
        
                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:orientation="vertical">
        
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@{user.name}" />
        
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@{String.valueOf(user.age)}" />
        
        
                </LinearLayout>
        
        
            </androidx.constraintlayout.widget.ConstraintLayout>
        </layout>



### 在使用的地方进行数据绑定


        public class DataBindingActivity extends AppCompatActivity {
        
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                DataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.data_binding);
                User user = new User("wilson", 11);
                binding.setUser(user);
                binding.setLifecycleOwner(this);
        
        
        
            }
        }



### 注意!! 


DataBindingBinding 是对应data_binding布局生成的文件


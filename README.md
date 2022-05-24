# android

1.gradle 加速

```groovy
 maven { url 'https://maven.aliyun.com/repository/public/' }
 maven { url 'https://maven.aliyun.com/repository/google' }
```


        项目中的build.gradle
        buildscript {
            repositories {
                maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
                        maven{ url 'http://maven.aliyun.com/nexus/content/repositories/jcenter'}
            }
        dependencies {
        classpath 'com.android.tools.build:gradle:2.2.3'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
            }
        }

        allprojects {
            repositories {
                maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
                maven{ url 'http://maven.aliyun.com/nexus/content/repositories/jcenter'}
            }
        }
        对所有项目生效，在USER_HOME/.gradle/下创建init.gradle文件
        allprojects{
            repositories {
                def ALIYUN_REPOSITORY_URL =http://maven.aliyun.com/nexus/content/groups/public'
                def ALIYUN_JCENTER_URL = 'http://maven.aliyun.com/nexus/content/repositories/jcenter'
                all { ArtifactRepository repo ->
                    if(repo instanceof MavenArtifactRepository){
                        def url = repo.url.toString()
                        if (url.startsWith('https://repo1.maven.org/maven2')) {
                            project.logger.lifecycle "Repository ${repo.url} replaced by $ALIYUN_REPOSITORY_URL."
                            remove repo
                        }
                        if (url.startsWith('https://jcenter.bintray.com/')) {
                            project.logger.lifecycle "Repository ${repo.url} replaced by $ALIYUN_JCENTER_URL."
                            remove repo
                        }
                    }
                }
                maven {
                        url ALIYUN_REPOSITORY_URL
                    url ALIYUN_JCENTER_URL
                }
            }
            }

2.错误

1.1 [Cannot-set-the-value-of-read-only-property-'outputFile'](https://www.jianshu.com/p/9b25087a5d7d)

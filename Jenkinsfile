pipeline {
    agent any

    tools {
        jdk 'java'
        gradle 'gradle'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/MageswariMuthu/gradle-sample-project.git', branch: 'main'
            }
        }

        stage('Gradle Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Run Spock Tests') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit 'app/build/test-results/test/*.xml'
            }
        }
    }
}


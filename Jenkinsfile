pipeline {
    agent any 

    stages {
        stage('Build') { 
            steps { 
                sh './gradlew clean build'
            }
        }

		stage('SonarQube analysis') {
			steps {
				sh "./gradlew --stacktrace sonarqube -Dsonar.host.url=${env.SONAR_HOST_URL} -Dsonar.login=${SONAR_LOGIN}"
			}
		}			
    }
}
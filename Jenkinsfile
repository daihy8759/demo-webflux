pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /users/daihy/.m2:/root/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'sh \'mvn -DskipTests clean package\''
      }
    }

  }
}
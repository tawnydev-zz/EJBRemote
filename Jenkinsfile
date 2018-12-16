pipeline {
  agent {
    node {
      label 'JenkinsFile'
    }

  }
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/tawnydev/EJBRemote', branch: 'master', changelog: true)
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install package'
      }
    }
  }
}
node {
   def mvnHome
   def javaHome
       
    stage('Checkout') {
		git(url: 'https://github.com/tawnydev/EJBRemote', branch: 'master', changelog: true)
    }
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        git 'https://github.com/tawnydev/jenkins-sample-1.git'
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        // **       in the global configuration.           
        mvnHome = tool 'Maven 3.6.0'
        javaHome = tool 'Java 8'
   	}
    stage('Build') {
        // Run the maven build
		if (isUnix()) {
			sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
		} else {
			bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
		}
	}
}

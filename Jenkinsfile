pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Checkout source code from version control
                echo 'Getting source code from github'
            }
        }
        stage('Test') {
            steps {
                // Run unit tests
                echo 'run test cases'
            }
        }
        stage('Package') {
            steps {
                // Package compiled classes into a JAR file
                echo 'prepare JAR OR WAR file'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy JAR file to a remote server
                echo 'After completion of package deploy into server'
            }
        }
    }
    post {
        success {
            echo 'Pipeline succeeded! Project deployed successfully.'
        }
        failure {
            echo 'Pipeline failed! Please check the build logs for details.'
        }
    }
}

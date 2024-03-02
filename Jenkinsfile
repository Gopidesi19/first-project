node {

    stage('SCM') { 
        git credentialsId: 'a8464c19-6944-486f-aaa1-8281562888df', url: 'https://github.com/Gopidesi19/first-project.git'
    }
    stage('Build') {
       echo 'Build the project'
    }
    stage('Test') {
       echo 'Test the code'
    }
    stage('Result'){
        echo 'success'
    }
}

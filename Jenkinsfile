pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/master']],userRemoteConfigs:
                [[credentialsId: 'github-ssh-key', url: 'git@github.com:BrydenTrakalo/375final.git']]]
            }
        }

        stage('Build'){
            steps{            
                sh 'mvn compile -f pom.xml'               
            } 
        }

        stage('Test'){
            steps{            
                sh 'mvn test -f pom.xml'              
            }
        }
        
        // stage('Building image') {
        //     steps{
        //         script {
        //             dockerImage = docker.build registry
        //         }
        //     }
        // }

        // stage('Deploy image') {
        //     steps{
        //         script {
        //             docker.withRegistry( '', registryCredential) {
        //                 dockerImage.push()
        //             }
        //         }
        //     }
        // }
    }

}

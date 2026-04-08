pipeline {
    agent any
    stages {
        stage('Clone') {
            steps { git 'https://github.com/SourabhiPrabakaran/movie-booking-system' }
        }
        stage('Build') {
            steps { sh 'mvn clean package' }
        }
        stage('Test') {
            steps { sh 'mvn test' }
        }
        stage('Docker Build') {
            steps { sh 'docker build -t sourabhip/movie-booking:latest .' }
        }
        stage('Docker Push') {
            steps { sh 'docker push sourabhip/movie-booking:latest' }
        }
        stage('Deploy') {
            steps { sh 'kubectl apply -f deployment.yaml' }
        }
    }
}
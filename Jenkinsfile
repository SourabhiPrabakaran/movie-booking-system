pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/SourabhiPrabakaran/movie-booking-system'
            }
        }
        stage('Build') {
            steps { bat 'mvn clean package' }
        }
        stage('Test') {
            steps { bat 'mvn test' }
        }
        stage('Docker Build') {
            steps { bat 'docker build -t sourabhip/movie-booking:latest .' }
        }
        stage('Docker Push') {
            steps { bat 'docker push sourabhip/movie-booking:latest' }
        }
        stage('Deploy') {
            steps { 
        bat 'kubectl apply -f deployment.yaml --kubeconfig="C:\\Users\\soura\\.kube\\config" --validate=false'
    }
}
    }
}
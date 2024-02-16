package org.avengers.common
def call(String) {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/OT-MICROSERVICES/employee-api.git/'
            }
        }  
}

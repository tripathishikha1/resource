package org.avengers.common

def call(String url, String branch) {
    stage('Clone') {
        script {
            git branch: "${branch}", url: "${url}"
        }
    }
}

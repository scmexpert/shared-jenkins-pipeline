#!/usr/bin/env groovy

def call() {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                    sh 'echo checkout'
                }
            }

            stage('build') {
                steps {
                    sh 'echo compile'
                }
            }

            stage ('test') {
                steps {
                    sh 'echo  test'
                }
            }

            stage('deploy'){
                steps {
                    sh 'echo deploy'
                }
            }

    }
}

}

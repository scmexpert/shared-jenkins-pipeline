#!/usr/bin/env groovy

def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[credentialsId: stageParams.sshkey, url: stageParams.url ]]
    ])
  }

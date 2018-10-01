node{
	stage('SCM Checkout'){
		checkout([$class: 'GitSCM', branches: [[name: '*/work'],
 [name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], 
submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'd1be5bf4-52ea-4fd5-ae0f-453c6e3a1432', 
url: 'https://github.com/aFanofFilm/simple-maven-project.git']]])
}
	stage('Execute Shell Script'){
		tool name: 'Maven3', type: 'maven'
		bat 'mvn clean package'
}
}
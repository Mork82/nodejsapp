job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/Mork82/nodejsapp.git', 'master') { node ->
            node / gitConfigName('Jose Corcoles')
            node / gitConfigEmail('joscorconn@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    
    
}

package org.foo

class Bar implements Serializable {
    def script

    Bar(script) {
        this.script = script
    }

    void execute() {
        script.echo "Hello World"
    }
}

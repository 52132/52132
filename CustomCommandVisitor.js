const CommandLangVisitor = require("./generated/CommandLangVisitor").CommandLangVisitor;

class CustomCommandVisitor extends CommandLangVisitor {
  visitComando(ctx) {
    const nombreFuncion = ctx.nombreCommand().getText();
    const argumentos = ctx.argumento().map(arg => this.visit(arg));

    // Separar posicionales y opcionales
    const posicionales = argumentos.filter(arg => arg.tipo === "posicional");
    const opcionales = argumentos.filter(arg => arg.tipo === "opcional");

    if (nombreFuncion === "saludar") {
      const nombre = posicionales[0]?.valor?.replace(/"/g, "") || "usuario";
      console.log(`function saludar(nombre) {
  console.log("Hola", nombre);
}
saludar("${nombre}");`);
    } else {
      console.log(`No se reconoce el comando: ${nombreFuncion}`);
    }
  }

  visitArgumento(ctx) {
    if (ctx.argumentoPosicional()) return this.visit(ctx.argumentoPosicional());
    return this.visit(ctx.argumentoOpcional());
  }

  visitArgumentoPosicional(ctx) {
    return { tipo: "posicional", valor: ctx.getText() };
  }

  visitArgumentoOpcional(ctx) {
    const nombre = ctx.nombreArgumento().getText();
    const valor = ctx.valorArgumento() ? ctx.valorArgumento().getText().replace(/"/g, "") : true;
    return { tipo: "opcional", nombre, valor };
  }
}

module.exports = CustomCommandVisitor;


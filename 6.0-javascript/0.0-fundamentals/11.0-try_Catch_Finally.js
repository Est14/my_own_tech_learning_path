try {
    arr ;
} catch (error) {
    console.log(`This is the ERROR: ${error}`)
} finally{
    console.log('Try again hahaha.')
}
try {
    let numero = "y";
    if (isNaN(numero)) {
      throw new Error("El caractér introducido no es un Número");
    }
    console.log(numero * numero);
  } catch (error) {
    console.log(`Se produjo el siguiente error: ${error}`);
  }
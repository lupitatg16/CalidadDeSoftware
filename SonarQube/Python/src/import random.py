import random

def calcular_promedio(lista):
    suma = 0
    for i in range(len(lista)):
        suma = suma + lista[i]
    return suma / len(lista)

def generar_numeros():
    numeros = []
    for i in range(1000):
        numeros.append(random.randint(1, 100))
    return numeros

def procesar_datos():
    datos = generar_numeros()
    promedio = calcular_promedio(datos)
    print("El promedio es: " + str(promedio))

    # Buscar el número más grande
    maximo = datos[0]
    for numero in datos:
        if numero > maximo:
            maximo = numero

    print("El número más grande es: " + str(maximo))

    # Contar números pares
    pares = 0
    for i in range(len(datos)):
        if datos[i] % 2 == 0:
            pares = pares + 1

    print("La cantidad de números pares es: " + str(pares))

if __name__ == "__main__":
    procesar_datos()
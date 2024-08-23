class ConjuntoADT:
    def __init__(self):
        self.elementos = []


    def __str__(self):
        return '{' + ', '.join(str(e) for e in self.elementos) + '}'
   
    def longitud(self):
        return len(self.elementos)
   
    def contiene(self, elemento):
        return elemento in self.elementos

    def agregar(self, elemento):
        if elemento not in self.elementos:
            self.elementos.append(elemento)

    def eliminar(self, elemento):
        if elemento in self.elementos:
            self.elementos.remove(elemento)
       
    def equals(self, otro_conjunto):
        if self.tamaño() != otro_conjunto.tamaño():
            return False
        for elemento in self.elementos:
            if elemento not in otro_conjunto.elementos:
                return False
        return True

    def esSubconjunto(self, otro_conjunto):
        for elemento in self.elementos:
            if elemento not in otro_conjunto.elementos:
                return False
        return True

    def union(self, otro_conjunto):
        nuevo_conjunto = ConjuntoADT()
        nuevo_conjunto.elementos = self.elementos.copy()
        for elemento in otro_conjunto.elementos:
            if elemento not in nuevo_conjunto.elementos:
                nuevo_conjunto.elementos.append(elemento)
        return nuevo_conjunto
    
    def interseccion(self, otro_conjunto):
        nuevo_conjunto = ConjuntoADT()
        for elemento in self.elementos:
            if elemento in otro_conjunto.elementos:
                nuevo_conjunto.agregar(elemento)
        return nuevo_conjunto


    def diferencia(self, otro_conjunto):
        nuevo_conjunto = ConjuntoADT()
        for elemento in self.elementos:
            if elemento not in otro_conjunto.elementos:
                nuevo_conjunto.agregar(elemento)
        return nuevo_conjunto


#Implementación
#Creación del conjunto uno (felinos)
conjunto1 = ConjuntoADT()
conjunto1.agregar("gato")
conjunto1.agregar("león")
conjunto1.agregar("puma")
conjunto1.agregar("pantera")


#Creación del conjunto dos (mascotas)
conjunto2 = ConjuntoADT()
conjunto2.agregar("gato")
conjunto2.agregar("perro")
conjunto2.agregar("pez")
conjunto2.agregar("conejo")


print("---Creación de los conjuntos ---")
print("Conjunto 1:", conjunto1)
print("Conjunto 2:", conjunto2)


#Agregar a conjunto
conjunto1.agregar("caracal")
conjunto2.agregar("perico")


print("---Agregación a los dos conjuntos---")
print("Conjunto 1:", conjunto1)
print("Conjunto 2:", conjunto2)
#Eliminar elemento de conjunto
conjunto1.eliminar("puma")


print("---Eliminación de elementos---")
print("Conjunto 1:", conjunto1)
print("Conjunto 2:", conjunto2)


#Pertenencia de un elemento a un conjunto
print("---Pertenencia a un conjunto---")
elemento_pertenece = "tortuga"
# Verificar si el elemento está en el conjunto
if conjunto1.contiene(elemento_pertenece):
    print(f"El elemento {elemento_pertenece} pertenece al conjunto")
else:
    print(f"El elemento {elemento_pertenece} NO pertenece al conjunto")


elemento_pertenece = "perico"
# Verificar si el elemento está en el conjunto
if conjunto2.contiene(elemento_pertenece):
    print(f"El elemento {elemento_pertenece} pertenece al conjunto")
else:
    print(f"El elemento {elemento_pertenece} NO pertenece al conjunto")


#Unión de dos conjuntos
union_conjuntos = conjunto1.union(conjunto2)
print("---Unión:", union_conjuntos)

#Intersección entre conjuntos
interseccion_conjuntos = conjunto1.interseccion(conjunto2)
print("Intersección:", interseccion_conjuntos)


#Diferencia entre conjuntos
#Diferencia entre conjunto1 - conjunto2
diferencia_conjuntos = conjunto2.diferencia(conjunto1)
print("---Diferencia conjunto 2 - conjunto 1:", diferencia_conjuntos)

#Diferencia entre conjunto2 - conjunto1
diferencia_conjuntos = conjunto1.diferencia(conjunto2)
print("---Diferencia conjunto 1 - conjunto 2:", diferencia_conjuntos)


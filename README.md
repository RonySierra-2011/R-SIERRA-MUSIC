# Discos Personalizados (Custom Discs) — Mod de FORGE para Minecraft 1.20.1

Este es la versión **Forge** (no Fabric) del mod. Añade dos discos de música
nuevos que suenan en el jukebox (caja de música):

- 🎵 **Luz en la Tormenta** → `customdiscs:luz_en_la_tormenta_disc`
- 🎵 **Me das VIDA** → `customdiscs:me_das_vida_disc`

## Importante: es un repo NUEVO, no mezcles con el de Fabric

Fabric y Forge son incompatibles entre sí — el código, las dependencias y la
estructura del proyecto son distintas. **Sube este proyecto a un repositorio
de GitHub aparte** (o borra todo el contenido del repo viejo y sube esto en
su lugar). No copies archivos sueltos de un proyecto al otro.

## Pasos para generar tu .jar en GitHub

1. Crea un repositorio nuevo en GitHub, por ejemplo `discos-personalizados-forge`.
2. Sube TODO el contenido de esta carpeta (incluyendo la carpeta oculta
   `.github`, ver nota abajo).
3. En cuanto hagas el push, la pestaña **Actions** compilará el mod solo
   (puede tardar más que Fabric, 5-8 minutos, porque Forge es más pesado).
4. Cuando termine (✅ verde), entra a esa ejecución y descarga el artefacto
   **`customdiscs-forge-jar`** — ahí está tu `.jar`.

### Sobre la carpeta `.github`

Si subes arrastrando archivos desde el explorador de tu computadora, muchas
veces la carpeta `.github` (empieza con un punto) queda oculta y no se sube.
Si eso pasa, entra a tu repo → **"Add file"** → **"Create new file"** → en el
nombre escribe `.github/workflows/build.yml` y pega el contenido de ese
archivo (lo tienes en esta misma carpeta).

## Cómo instalarlo en Minecraft

1. Instala **Minecraft Forge** para la versión 1.20.1 (desde files.minecraftforge.net),
   eligiendo el instalador de cliente.
2. Abre Minecraft con el perfil de Forge una vez para que se cree la carpeta `mods`.
3. Coloca el `.jar` que generó GitHub Actions dentro de la carpeta `mods`.
4. Listo, no necesitas ningún mod adicional (a diferencia de Fabric, que
   pedía Fabric API por separado).

## Cómo obtener los discos en el juego

Búscalos en el inventario creativo (pestaña de herramientas y utilidades) o usa:

```
/give @p customdiscs:luz_en_la_tormenta_disc
/give @p customdiscs:me_das_vida_disc
```

Ponlos en un jukebox como cualquier disco vanilla y sonará tu canción. 🎶

## Estructura del proyecto

```
mod-forge/
├── build.gradle
├── settings.gradle
├── gradle.properties
├── LICENSE
├── .github/workflows/build.yml   ← compila el .jar automáticamente
└── src/main/
    ├── java/com/tumod/customdiscs/
    │   ├── CustomDiscsMod.java   ← clase principal (@Mod)
    │   ├── ModSounds.java        ← registra los sonidos
    │   └── ModItems.java         ← registra los discos como items
    └── resources/
        ├── META-INF/mods.toml
        ├── pack.mcmeta
        └── assets/customdiscs/
            ├── sounds.json
            ├── sounds/
            │   ├── luz_en_la_tormenta.ogg
            │   └── me_das_vida.ogg
            ├── models/item/*.json
            ├── textures/item/*.png
            └── lang/es_es.json, en_us.json
```

## Notas

- Este proyecto usa **Forge 47.3.0** (para Minecraft 1.20.1). Si en tu server
  o el modpack de tus amigos usan otra build de Forge, dime cuál y ajusto
  `gradle.properties`.
- Las texturas son placeholders simples (círculos de colores). Reemplaza los
  PNG en `textures/item/` por imágenes de 16x16 si quieres portadas propias.

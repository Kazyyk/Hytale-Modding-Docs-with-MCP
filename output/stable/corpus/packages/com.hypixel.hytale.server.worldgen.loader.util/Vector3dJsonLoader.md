# Vector3dJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.util | Extends: JsonLoader

public class Vector3dJsonLoader extends JsonLoader<SeedStringResource, Vector3d>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public Vector3d load()
- return new Vector3d()
- return new Vector3d(value, value, value)
- return new Vector3d(x, y, z)
- throw new Error("No valid definition for Vector3d found!")

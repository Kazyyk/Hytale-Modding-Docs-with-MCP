# CaveGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveGenerator>

public class CaveGeneratorJsonLoader extends JsonLoader<SeedStringResource, CaveGenerator>

Top-level JSON loader for the cave generation system. Reads the `Caves.json` file from the cave folder and constructs a `CaveGenerator` containing an array of `CaveType` instances loaded via CaveTypesJsonLoader. Returns null if no cave file exists.

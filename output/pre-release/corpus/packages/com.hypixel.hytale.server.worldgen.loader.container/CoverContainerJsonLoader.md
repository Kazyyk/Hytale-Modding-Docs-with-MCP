# CoverContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class CoverContainerJsonLoader extends JsonLoader<SeedStringResource, CoverContainer>

JSON loader that parses cover container configuration for a biome. Supports both array and single-object formats. Each entry defines block types, weights, offsets, noise mask, height threshold, parent block condition, and on-water flag. Supports modify events via `ModifyEvents.BiomeCovers`.

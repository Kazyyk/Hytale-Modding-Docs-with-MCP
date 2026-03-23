# LayerContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class LayerContainerJsonLoader extends JsonLoader<SeedStringResource, LayerContainer>

JSON loader that parses layer container configuration for a biome. Loads the default filling block, static layers (with min/max Y ranges), and dynamic layers (with noise-driven offsets). Supports modify events via `ModifyEvents.BiomeStaticLayers`.

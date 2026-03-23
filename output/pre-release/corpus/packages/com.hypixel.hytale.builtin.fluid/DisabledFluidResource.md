# DisabledFluidResource

Type: class | Package: com.hypixel.hytale.builtin.fluid | Implements: Resource

public class DisabledFluidResource implements Resource

Chunk store resource that caches the set of disabled fluid IDs based on the world configuration's disabled fluid ticker tags. Lazily resolves fluid IDs from tag names and invalidates when the configuration changes.

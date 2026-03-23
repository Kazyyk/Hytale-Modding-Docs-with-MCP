# CavePrefab

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.element | Implements: CaveElement

public class CavePrefab implements CaveElement

## Fields

- private final WorldGenPrefabSupplier prefabSupplier
- private final PrefabRotation rotation
- private final IIntCondition biomeMask
- private final BlockMaskCondition blockMask
- private final IWorldBounds bounds
- private final int x
- private final int y
- private final int z

## Methods

- @Nonnull public WorldGenPrefabSupplier getPrefab()
- @Nonnull public PrefabRotation getRotation()
- public IIntCondition getBiomeMask()
- public BlockMaskCondition getConfiguration()
- public int getX()
- public int getY()
- public int getZ()
- @Nonnull @Override public IWorldBounds getBounds()

# BlockSelectionSnapshot

Type: class | Package: com.hypixel.hytale.builtin.buildertools.snapshot | Implements: SelectionSnapshot<BlockSelectionSnapshot>

public class BlockSelectionSnapshot implements SelectionSnapshot<BlockSelectionSnapshot>

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

- selection | BlockSelection | final BlockSelection field.

## Constructors

- BlockSelectionSnapshot(BlockSelection snapshot) | Creates a new BlockSelectionSnapshot instance.

## Methods

- getBlockSelection() | BlockSelection | public method.
- restore(Ref<EntityStore> ref, Player player, @Nonnull World world, ComponentAccessor<EntityStore> componentAccessor) | BlockSelectionSnapshot | public method.
- copyOf(@Nonnull BlockSelection selection) | BlockSelectionSnapshot | static public method.

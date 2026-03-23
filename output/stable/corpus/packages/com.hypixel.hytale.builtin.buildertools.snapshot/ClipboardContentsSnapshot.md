# ClipboardContentsSnapshot

Type: class | Package: com.hypixel.hytale.builtin.buildertools.snapshot | Implements: ClipboardSnapshot<ClipboardContentsSnapshot>

public class ClipboardContentsSnapshot implements ClipboardSnapshot<ClipboardContentsSnapshot>

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

- selection | BlockSelection | final BlockSelection field.

## Constructors

- ClipboardContentsSnapshot(BlockSelection selection) | Creates a new ClipboardContentsSnapshot instance.

## Methods

- copyOf(@Nonnull BlockSelection selection) | ClipboardContentsSnapshot | static public method.

Also in this package: BlockSelectionSnapshot, ClipboardBoundsSnapshot, EntityAddSnapshot, EntityRemoveSnapshot, EntitySnapshot, EntityTransformSnapshot, SelectionSnapshot

Complete API:
  public ClipboardContentsSnapshot restoreClipboard(Ref<EntityStore> ref, Player player, World world, BuilderToolsPlugin.BuilderState builderState, ComponentAccessor<EntityStore> componentAccessor)
  public static ClipboardContentsSnapshot copyOf(BlockSelection selection)

Fields:
private final BlockSelection selection

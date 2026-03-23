# ClipboardBoundsSnapshot

Type: class | Package: com.hypixel.hytale.builtin.buildertools.snapshot | Implements: ClipboardSnapshot<ClipboardBoundsSnapshot>

public class ClipboardBoundsSnapshot implements ClipboardSnapshot<ClipboardBoundsSnapshot>

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

- min | Vector3i | final Vector3i field.
- max | Vector3i | final Vector3i field.

## Constructors

- ClipboardBoundsSnapshot(@Nonnull BlockSelection selection) | Creates a new ClipboardBoundsSnapshot instance.
- ClipboardBoundsSnapshot(Vector3i min, Vector3i max) | Creates a new ClipboardBoundsSnapshot instance.

## Methods

- getMin() | Vector3i | public method.
- getMax() | Vector3i | public method.

Also in this package: BlockSelectionSnapshot, ClipboardContentsSnapshot, EntityAddSnapshot, EntityRemoveSnapshot, EntitySnapshot, EntityTransformSnapshot, SelectionSnapshot

Complete API:
  public Vector3i getMin()
  public Vector3i getMax()
  public ClipboardBoundsSnapshot restoreClipboard(Ref<EntityStore> ref, Player player, World world, BuilderToolsPlugin.BuilderState state, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final ClipboardBoundsSnapshot EMPTY
private final Vector3i min
private final Vector3i max

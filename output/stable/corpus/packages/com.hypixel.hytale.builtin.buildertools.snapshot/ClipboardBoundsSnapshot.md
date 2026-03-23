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

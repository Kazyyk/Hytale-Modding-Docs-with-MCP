# DistortedShapes

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: null

public final class DistortedShapes

## Fields

- public static final DistortedShape.Factory CYLINDER
- public static final DistortedShape.Factory ELLIPSE
- public static final DistortedShape.Factory PIPE
- private static final Map<String, DistortedShape.Factory> SHAPES
- DistortedShape.Factory factory

## Constructors

- private DistortedShapes()

## Methods

- public static void register(String name, DistortedShape.Factory factory)
- public static void forEach(BiConsumer<String, DistortedShape.Factory> consumer)
- public static void forEachName(Consumer<String> consumer)
- public static void forEachShape(Consumer<DistortedShape.Factory> consumer)
- public static DistortedShape.Factory getDefault()
- public static DistortedShape.Factory getOrDefault(String name)
- public static DistortedShape.Factory getByName(String name)

## Related Types

- DistortedCylinderShape
- DistortedEllipsoidShape
- DistortedPipeShape
- DistortedShape

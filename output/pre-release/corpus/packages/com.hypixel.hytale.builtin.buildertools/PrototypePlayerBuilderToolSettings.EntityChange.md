# PrototypePlayerBuilderToolSettings.EntityChange

Type: record | Package: com.hypixel.hytale.builtin.buildertools

public record EntityChange(double x, double y, double z, Holder<EntityStore> entityHolder)

Inner record of PrototypePlayerBuilderToolSettings that stores an entity's position and cloned holder data for clipboard transform operations. Created during selection copy/transform when entities are captured from the selection region.

## Record Components

- x | double | World X coordinate of the entity.
- y | double | World Y coordinate of the entity.
- z | double | World Z coordinate of the entity.
- entityHolder | Holder<EntityStore> | Cloned entity holder containing all entity components.

## Related Types

- PrototypePlayerBuilderToolSettings -- enclosing class
- PrototypePlayerBuilderToolSettings.FluidChange -- companion record for fluid data

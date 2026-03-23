# EventHandler.Modifier

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier

public record Modifier(@Nonnull Target target, @Nonnull Op[] ops)

Record containing a target and an array of operations to apply to matching events.

## Record Components


@Nonnull Target target, @Nonnull Op[] ops

Known subclasses: StaticModifier

Also in this package: EventHandler, PriorityEntry, Target, WorldGenModifier

Fields:
public static final EventHandler.Modifier[] EMPTY_ARRAY

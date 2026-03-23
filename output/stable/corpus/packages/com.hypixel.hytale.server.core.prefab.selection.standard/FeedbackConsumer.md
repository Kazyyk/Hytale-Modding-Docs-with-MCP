# FeedbackConsumer

Type: interface | Package: com.hypixel.hytale.server.core.prefab.selection.standard

@FunctionalInterface
public interface FeedbackConsumer

Functional interface for receiving progress feedback during BlockSelection placement operations. Called once per block or fluid placed, providing a feedback key, total count, current count, the command sender, and the entity store accessor.

## Constants


FeedbackConsumer DEFAULT = (key, total, count, target, componentAccessor) -> {}

No-op default implementation that discards all feedback.

## Methods


void accept(@Nonnull String var1, int var2, int var3, @Nonnull CommandSender var4, @Nonnull ComponentAccessor<EntityStore> var5)

Called during placement with:
- `var1` -- feedback key identifying the operation (may be `null` at the call site)
- `var2` -- total number of blocks/fluids being placed
- `var3` -- current progress count (1-based)
- `var4` -- the `CommandSender` initiating the placement
- `var5` -- `ComponentAccessor<EntityStore>` for the entity store

## Related Types

- BlockSelection -- the placement methods that invoke this callback
- `CommandSender` -- the command sender passed to the callback
- `ComponentAccessor` -- entity store accessor passed to the callback

Also in this package: BlockComparingIterator, BlockHolder, BlockIterator, BlockSelection, FallbackMode, FluidHolder, FluidIterator

Complete API:
  void accept(String var1, int var2, int var3, CommandSender var4, ComponentAccessor<EntityStore> var5)

Fields:
FeedbackConsumer DEFAULT

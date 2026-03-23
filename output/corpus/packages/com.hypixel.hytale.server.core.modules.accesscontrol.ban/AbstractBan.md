# AbstractBan

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.ban | Implements: Ban

abstract class AbstractBan implements Ban

## Fields

- protected final UUID target
- protected final UUID by
- protected final Instant timestamp
- protected final Optional<String> reason

## Methods

- @Override public UUID getTarget()
- @Override public UUID getBy()
- @Override public Instant getTimestamp()
- @Nonnull @Override public Optional<String> getReason()
- @Nonnull @Override public JsonObject toJsonObject()

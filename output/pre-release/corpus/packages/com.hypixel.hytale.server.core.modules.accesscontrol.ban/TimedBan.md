# TimedBan

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.ban | Extends: AbstractBan

public class TimedBan extends AbstractBan

## Fields

- private final Instant expiresOn

## Methods

- @Nonnull public static TimedBan fromJsonObject(JsonObject object) throws JsonParseException
- @Override public boolean isInEffect()
- @Nonnull @Override public String getType()
- public Instant getExpiresOn()
- @Nonnull @Override public CompletableFuture<Optional<String>> getDisconnectReason(UUID uuid)
- @Nonnull @Override public JsonObject toJsonObject()

Also in this package: AbstractBan, Ban, BanParser, InfiniteBan

Complete API:
  public static TimedBan fromJsonObject(JsonObject object)
  public boolean isInEffect()
  public String getType()
  public Instant getExpiresOn()
  public CompletableFuture<Optional<Message>> getDisconnectReason(UUID uuid)
  public JsonObject toJsonObject()

Fields:
private final Instant expiresOn

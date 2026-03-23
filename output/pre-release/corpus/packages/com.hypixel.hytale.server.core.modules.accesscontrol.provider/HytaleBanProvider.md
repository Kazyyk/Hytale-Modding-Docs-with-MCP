# HytaleBanProvider

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.provider | Extends: BlockingDiskFile | Implements: AccessProvider

public class HytaleBanProvider extends BlockingDiskFile implements AccessProvider

## Fields

- private final Map<UUID,Ban> bans

## Methods

- @Nonnull @Override public CompletableFuture<Optional<String>> getDisconnectReason(UUID uuid)
- @Override protected void read(BufferedReader fileReader)
- @Override protected void write(BufferedWriter fileWriter) throws IOException
- @Override protected void create(BufferedWriter fileWriter) throws IOException
- public boolean hasBan(UUID uuid)
- public boolean modify(Function<Map<UUID,Ban>,Boolean> function)

Also in this package: AccessProvider, ClientDelegatingProvider, HytaleWhitelistProvider

Complete API:
  public CompletableFuture<Optional<Message>> getDisconnectReason(UUID uuid)
  protected void read(BufferedReader fileReader)
  protected void write(BufferedWriter fileWriter)
  protected void create(BufferedWriter fileWriter)
  public boolean hasBan(UUID uuid)
  public boolean modify(Function<Map<UUID,Ban>,Boolean> function)

Fields:
private final Map<UUID,Ban> bans

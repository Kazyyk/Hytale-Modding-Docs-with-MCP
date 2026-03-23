# HytaleWhitelistProvider

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.provider | Extends: BlockingDiskFile | Implements: AccessProvider

public class HytaleWhitelistProvider extends BlockingDiskFile implements AccessProvider

## Fields

- private static final String WHITELIST_FILE_PATH
- private final ReadWriteLock lock
- private final Set<UUID> whitelist
- private boolean isEnabled

## Methods

- @Override protected void read(BufferedReader fileReader)
- @Override protected void write(BufferedWriter fileWriter) throws IOException
- @Override protected void create(BufferedWriter fileWriter) throws IOException
- @Nonnull @Override public CompletableFuture<Optional<String>> getDisconnectReason(UUID uuid)
- public void setEnabled(boolean isEnabled)
- public boolean modify(Function<Set<UUID>,Boolean> consumer)
- @Nonnull public Set<UUID> getList()
- public boolean isEnabled()

Also in this package: AccessProvider, ClientDelegatingProvider, HytaleBanProvider

Complete API:
  protected void read(BufferedReader fileReader)
  protected void write(BufferedWriter fileWriter)
  protected void create(BufferedWriter fileWriter)
  public CompletableFuture<Optional<Message>> getDisconnectReason(UUID uuid)
  public void setEnabled(boolean isEnabled)
  public boolean modify(Function<Set<UUID>,Boolean> consumer)
  public Set<UUID> getList()
  public boolean isEnabled()

Fields:
private static final String WHITELIST_FILE_PATH
private final ReadWriteLock lock
private final Set<UUID> whitelist
private boolean isEnabled

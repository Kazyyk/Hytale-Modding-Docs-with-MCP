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

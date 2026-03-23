# PasswordPacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers.login | Extends: GenericConnectionPacketHandler

public class PasswordPacketHandler extends GenericConnectionPacketHandler

Handles optional password verification during login. If the server has a password configured and a challenge was issued, validates the client's SHA-256 hash response. Allows up to 3 attempts before disconnecting. If no password is required, immediately proceeds to the game setup handler.

## Methods


@Nonnull
@Override
public String getIdentifier()


@Override
public void registered0(PacketHandler oldHandler)


@Override
public void accept(@Nonnull ToServerPacket packet)


public void handle(@Nonnull Disconnect packet)


public void handle(@Nonnull PasswordResponse packet)

Validates the password hash against the expected value. On mismatch, decrements attempts and issues a new challenge. On match, proceeds to setup.

## Inner Types

- **SetupHandlerSupplier** -- Functional interface for creating the next `PacketHandler` after password verification.

Also in this package: AuthHandlerSupplier, AuthState, AuthenticationPacketHandler, HandshakeHandler, SetupHandlerSupplier

Complete API:
  public String getIdentifier()
  public void registered0(PacketHandler oldHandler)
  public void accept(ToServerPacket packet)
  public void handle(ClientDisconnect packet)
  public void handle(PasswordResponse packet)
  private static byte[] generateChallenge()
  private void proceedToSetup()
  private static byte[] computePasswordHash(byte[] challenge, String password)

Fields:
private static final HytaleLogger LOGGER
private static final int MAX_PASSWORD_ATTEMPTS
private static final int CHALLENGE_LENGTH
private final UUID playerUuid
private final String username
private final byte[] referralData
private final HostAddress referralSource
private byte[] passwordChallenge
private final PasswordPacketHandler.SetupHandlerSupplier setupHandlerSupplier
private int attemptsRemaining

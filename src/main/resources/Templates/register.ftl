<h2>Rejestracja</h2>
<form method="post" action="/register">
    <label>Email:</label><br>
    <input type="email" name="email" required><br><br>

    <label>Hasło:</label><br>
    <input type="password" name="password" required><br><br>

    <label>Powtórz hasło:</label><br>
    <input type="password" name="confirmPassword" required><br><br>

    <label>Numer telefonu:</label><br>
    <input type="tel" name="phoneNumber"><br><br>

    <label>Data urodzenia:</label><br>
    <input type="date" name="birthDate"><br><br>

    <label>Ulica:</label><br>
    <input type="text" name="street"><br><br>

    <label>Kod pocztowy:</label><br>
    <input type="text" name="postalCode"><br><br>

    <label>Kraj:</label><br>
    <input type="text" name="country"><br><br>

    <label>Język:</label><br>
    <select name="language">
        <option value="pl">Polski</option>
        <option value="en">Angielski</option>
        <option value="de">Niemiecki</option>
    </select><br><br>

    <label>Newsletter (Email):</label>
    <input type="checkbox" name="newsletterEmail"><br>

    <label>Newsletter (SMS):</label>
    <input type="checkbox" name="newsletterSms"><br><br>

    <button type="submit">Zarejestruj się</button>
</form>

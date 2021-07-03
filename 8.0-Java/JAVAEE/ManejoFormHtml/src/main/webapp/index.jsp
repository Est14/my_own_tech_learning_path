<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form practice</title>
    <link rel="stylesheet" type="text/css" href="resources/styles.css">
    <script type="text/javascript" src="resources/functions.js"></script>
</head>
<body>
<form name="form1" method="post" action="Servlet" onsubmit="return validatedF(this)">
    <input type="hidden" name="hidden" value="hiddenValue"> </input>
    <table width="200" id="emphasis-column">
        <caption>
            Register Form
        </caption>
        <tr>
            <td class="column">
                User: (*)
            </td>
            <td>
                <label>
                    <input class="default" type="text" name="user" value="Write user" onfocus="this.select()">
                </label>
            </td>
        </tr>
        <tr>
            <td class="column">
                Password: (*)
            </td>
            <td>
                <label>
                    <input class="default" type="password" name="password" onfocus="this.select()">
                </label>
            </td>
        </tr>
        <tr>
            <td class="column">
                Internet Technologies: (*)
            </td>
            <td>
               Java <label>
                <input type="checkbox" name="technology" value="java">
                &nbsp;&nbsp;&nbsp;
            </label>
                .net <label>
                <input type="checkbox" name="technology" value="net">
                &nbsp;&nbsp;&nbsp;
            </label>
                Php <label>
                <input type="checkbox" name="technology" value="php">
                &nbsp;&nbsp;&nbsp;
            </label>
            </td>
        </tr>

        <tr>
            <td class="column">
                Gender: (*)
            </td>
            <td>
                Man <label>
                <input type="radio" name="gender" value="h">
            </label>
                &nbsp;&nbsp;&nbsp;
                Woman <label>
                <input type="radio" name="gender" value="w">
            </label>
                &nbsp;&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td class="column">
                Occupation: (*)
            </td>
            <td>
                <label>
                    <select name="occupation" class="default">
                        <option value="">Select</option>
                        <option value="1">Teacher</option>
                        <option value="2">Engineer</option>
                        <option value="3">Police</option>
                        <option value="4">Other</option>
                    </select>
                </label>
            </td>
        </tr>
        <tr>
            <td class="column">
                Favorite Music:
            </td>
            <td>
                <label>
                    <select name="music" multiple class="default">
                        <option value="rock">Rock</option>
                        <option value="electronic">Electronic</option>
                        <option value="pop">Pop</option>
                    </select>
                </label>
            </td>
        </tr>
        <tr>
            <td class="column">
                Comments:
            </td>
            <td>
                <label>
                    <textarea name="comments" class="default" cols="30" rows="2" onfocus="this.select()">
                        Write a Text
                    </textarea>
                </label>
            </td>
        </tr>
        <tr style="text-align: center">
            <td>
                <input type="reset" class="default" value="clear">
            </td>
            <td>
                <input type="submit" class="default" value="send">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
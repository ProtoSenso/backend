package com.ttstudios.pi.user;

import com.ttstudios.granny_watcher.backend.dto.UserDto;
import com.ttstudios.pi.dao.persistence.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserResource {
    /**
     * @api {get} /api/temperature/:sensor_uid Get a temperature via its SensorUID code
     * @apiName getTemperatureBySensorUid
     * @apiGroup Books
     *
     * @apiParam {String} sensor_uid The temperature's unique SensorUID code
     *
     * @apiSampleRequest http://localhost:9080/api/temperature/111-1
     *
     * @apiSuccess {String} sensor_uid Temperature's SensorUID
     * @apiSuccess {String} title Title of temperature
     * @apiSuccess {String} device Temperature's device
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
    {
    "sensor_uid": "111-1",
    "title": "Java 8 Lamdas",
    "device": "Richard Warburton",
    "_links": {
        "self": {
            "href": "http://localhost:9080/api/temperature/111-1"
        }
    }
    }

        @ApiError 404 Temperature not found
     *
     */
    ResponseEntity<UserDto> getUserByUId(String uid);

    /**
     * @api {post} /api/temperature Add a temperature
     * @apiName addBook
     * @apiGroup Books
     *
     * @apiParam {String} sensor_uid The temperature's unique SensorUID code
     * @apiParam {String} title The temperature's title
     * @apiParam {String} device The temperature's device
     *
     * @apiParamExample {json} Request-Example:
    {
    "sensor_uid": "111-31",
    "title": "Test",
    "device": "Steve",
    "_links": {
        "self": {
            "href": "http://localhost:9080/api/temperature/111-31"
        },
        "Books": {
            "href": "http://localhost:9080/api/books"
        }
    }
    }
        @apiSuccessExample {json} Success-Response:
      *     HTTP/1.1 201 CREATED
     */
    ResponseEntity<UserDto> addUser(UserDto user);


    ResponseEntity<UserDto> addFollowee(String uid, String user);

    /**
     * @api {get} /api/books Get a list of all books
     * @apiName getAllBooks
     * @apiGroup Books
     * @apiDescription Get a list of all books stored
     *
     * @apiSampleRequest http://localhost:9080/api/books
     *
     * @apiSuccess {String} sensor_uid Temperature's SensorUID
     * @apiSuccess {String} title Title of temperature
     * @apiSuccess {String} device Temperature's device
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *      [
    {
    "sensor_uid": "111-1",
    "title": "Java 8 Lamdas",
    "device": "Richard Warburton",
    "_links": {
        "self": {
            "href": "http://localhost:9080/api/temperature/111-1"
        }
    }
    },
    {
    "sensor_uid": "111-3",
    "title": "Test",
    "device": "Steve",
    "_links": {
        "self": {
            "href": "http://localhost:9080/api/temperature/111-3"
        }
    }
    }
            ]
     */
    ResponseEntity<List<UserDto>> getAllUsers();

    /**
     * @api {put} /api/temperature/:sensor_uid Update a temperature
     * @apiName updateBook
     * @apiGroup Books
     * @apiDescription Update a temperature using its SensorUID code
     * @apiParam {String} title The temperature's title
     * @apiParam {String} device The temperature's device
     *
     * @apiSuccess {String} sensor_uid Temperature's SensorUID
     * @apiSuccess {String} title Title of temperature
     * @apiSuccess {String} device Temperature's device
     *
     * @apiSuccessExample {json} Success-Response
     *      HTTP/1.1 200 OK
     *      {
    "sensor_uid": "111-31",
    "title": "Test",
    "device": "Steve Austin",
    "_links": {
        "self": {
            "href": "http://localhost:9080/api/temperature/111-31"
        },
        "Books": {
            "href": "http://localhost:9080/api/books"
        }
    }
    }
     */
    ResponseEntity<UserDto> updateUser(String uid, UserDto user);

    /**
     * @api {delete} /api/temperature/:sensor_uid Delete a temperature
     * @apiName deleteBook
     * @apiGroup Books
     * @apiDescription Delete a temperature using its SensorUID
     *
     * @apiParam {String} sensor_uid The temperature's unique SensorUID code
     *
     * @apiSampleRequest http://localhost:9080/api/temperature/111-1
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *
     */
    ResponseEntity<Void> deleteUser(String uid);

}

<?php
/**
 * Created by PhpStorm.
 * User: Ariful Islam
 * Date: 30-Sep-17
 * Time: 3:44 AM
 */

class DB
{
    public $link;
    public $username;
    public $host;
    public $password;
    public $database;

    public function connection()
    {
        $this->link = new mysqli('localhost', 'username', '', 'dts');

    }

    public function select($q)
    {

    }

    public function update()
    {

    }

    /**
     * @return mixed
     */
    public function delete()
    {

    }
}